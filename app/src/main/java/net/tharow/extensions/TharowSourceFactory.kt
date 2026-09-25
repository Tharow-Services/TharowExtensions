package net.tharow.extensions

import eu.kanade.tachiyomi.source.Source

class TharowSourceFactory: eu.kanade.tachiyomi.source.SourceFactory {
    override fun createSources(): List<Source> = listOf(
        GrrlPower()
    )

}