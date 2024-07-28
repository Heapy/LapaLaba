/*
 * This file is generated by jOOQ.
 */
package io.heapy.komok.database.tables.daos


import io.heapy.komok.database.tables.Iface
import io.heapy.komok.database.tables.records.IfaceRecord

import kotlin.collections.List

import org.jooq.Configuration
import org.jooq.JSONB
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class IfaceDao(configuration: Configuration?) : DAOImpl<IfaceRecord, io.heapy.komok.database.tables.pojos.Iface, Long>(Iface.IFACE, io.heapy.komok.database.tables.pojos.Iface::class.java, configuration) {

    /**
     * Create a new IfaceDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: io.heapy.komok.database.tables.pojos.Iface): Long? = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Long?, upperInclusive: Long?): List<io.heapy.komok.database.tables.pojos.Iface> = fetchRange(Iface.IFACE.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Long): List<io.heapy.komok.database.tables.pojos.Iface> = fetch(Iface.IFACE.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Long): io.heapy.komok.database.tables.pojos.Iface? = fetchOne(Iface.IFACE.ID, value)

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfName(lowerInclusive: String, upperInclusive: String): List<io.heapy.komok.database.tables.pojos.Iface> = fetchRange(Iface.IFACE.NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    fun fetchByName(vararg values: String): List<io.heapy.komok.database.tables.pojos.Iface> = fetch(Iface.IFACE.NAME, *values)

    /**
     * Fetch records that have <code>schema BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfSchema(lowerInclusive: JSONB?, upperInclusive: JSONB?): List<io.heapy.komok.database.tables.pojos.Iface> = fetchRange(Iface.IFACE.SCHEMA, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>schema IN (values)</code>
     */
    fun fetchBySchema(vararg values: JSONB): List<io.heapy.komok.database.tables.pojos.Iface> = fetch(Iface.IFACE.SCHEMA, *values)
}
