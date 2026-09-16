# Tildes Minecraft Worlds

The Tildes.net community hosts seasonal Minecraft servers, showcasing the talent and creativity of its community.  This repo archives those worlds, and details the steps to play them.

The original datapacks for each world are included but disabled by default so the maps can load seamlessly in newer versions of vanilla Minecraft.  Player builds will remain intact, though biome data may change between versions.

Instructions to install datapacks are included in each download, but `datapacks-extract-to-world-folder.zip` should be unpacked directly over the world save folder using the map's original game version.

To reduce download size, chunks with under 5 minutes of total player activity have been trimmed.  Modded chunk data such as Starlight calculations has also been cleaned.  See `process-chunks.groovy` for that script.

Each world has been updated to enable cheats, set sunny conditions, and verify world spawn is correct.  A save icon and server icon are included with each world.

## Season 1

- **Dates:** 2023-07-28 to 2024-04-02
- **Minecraft Version:** 1.20.4

Datapacks do not include any biome data, and are only needed for custom recipes/behaviours.  Player data was not included with original map files.

[Download from Releases]()

## Season 2

- **Dates:** 2024-07-12 to 2025-07-17
- **Minecraft Version:** 1.21.4

Datapacks affect terrain generation, and must be installed to preserve biome data.  Pruning `PostProcessing` chunk data was necessary in The End to maintain vanilla compatibility, as the increased world height from Nullscape resulted in chunk errors.

[Download from Releases]()

## Season 3

- **Dates:** 2026-01-03 to 2026-09-01
- **Minecraft Version:** 26.2

Datapacks affect terrain generation, and must be installed to preserve biome data.

[Download from Releases]()
