@file:JsQualifier("Phaser.Tilemaps.Parsers")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Tilemaps.Parsers

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import Phaser.Tilemaps.OrientationType49
import Phaser.Tilemaps.MapData

external fun FromOrientationString(orientation: String = definedExternally): OrientationType49

external fun Parse(name: String, mapFormat: Number, data: Array<Array<Number>>?, tileWidth: Number, tileHeight: Number, insertNull: Boolean): MapData

external fun Parse(name: String, mapFormat: Number, data: String?, tileWidth: Number, tileHeight: Number, insertNull: Boolean): MapData

external fun Parse(name: String, mapFormat: Number, data: Any?, tileWidth: Number, tileHeight: Number, insertNull: Boolean): MapData

external fun Parse2DArray(name: String, data: Array<Array<Number>>, tileWidth: Number, tileHeight: Number, insertNull: Boolean): MapData

external fun ParseCSV(name: String, data: String, tileWidth: Number, tileHeight: Number, insertNull: Boolean): MapData