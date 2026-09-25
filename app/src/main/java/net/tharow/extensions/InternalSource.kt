package net.tharow.extensions

import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.online.HttpSource
import java.util.Observable

class InternalSource(
    override val baseUrl: String,
    override val lang: String,
    override val name: String,
    override val supportsLatest: Boolean
) : HttpSource() {

}