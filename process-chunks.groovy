/*
This [MCA Selector](https://github.com/querz/mcaselector) script will clean chunks to recover disk space, and improve vanilla compatibility.
Run under Tools > Change Fields > Script

Starlight data is trimmed to reduce filesize and bring conformance closer to vanilla.  It'll regenerate if the plugin is reinstalled.

Nullscape increases the world height of The End, changing 16 sections per chunk to 24.  Minecraft handles this reasonably well,
ignoring out-of-limit chunks and lighting data.  However, `PostProcessing` being too large does throw an `ArrayIndexOutOfBoundsException`,
so we need to trim that field from The End chunks.  This shouldn't have any adverse effects, as it's only used during new chunk generation.

This allows the dimension to be loaded safely in vanilla, including newer versions.  Note though that modded biomes (Nullscape and Terralith)
will be converted to `minecraft:plains`, and `Unknown registry key` errors will fill the log without loading the datapacks.

License: MIT
*/
import net.querz.mcaselector.io.mca.ChunkData;

void apply(ChunkData data) {

	def root = data.region().getData();

	// Trim PostProcessing compound to allow chunk loading without Nullscape datapack
	// Commented out, as this step is only needed to run on DIM1 in Minecraft 1.21.4
	//root.remove("PostProcessing");

	// Trimming Starlight data
	root.remove("starlight.light_version");
	if (root.containsKey("sections")) {
		def sections = root.getListTag("sections");
		if (sections != null) {
			for (int s = 0; s < sections.size(); s++) {
				def section = sections.get(s);
				if (section != null) {
					section.remove("starlight.blocklight_state");
					section.remove("starlight.skylight_state");
				}
			}
		}
	}
}
