package eu.kanade.tachiyomi.extension.tr.localuzaymanga

import eu.kanade.tachiyomi.multisrc.uzaymanga.UzayManga

class LocalUzayManga :
    UzayManga(
        name = "Local Uzay Manga",
        baseUrl = "https://uzaymanga.com",
        lang = "tr",
        versionId = 1,
    )
