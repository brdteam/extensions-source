package eu.kanade.tachiyomi.extension.tr.localtenshimanga

import eu.kanade.tachiyomi.multisrc.uzaymanga.UzayManga

class LocalTenshiManga :
    UzayManga(
        name = "Local Tenshi Manga",
        baseUrl = "https://tenshimanga.com",
        lang = "tr",
        versionId = 1,
    )
