@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Textures

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

external interface PixelConfig {
    var x: Number
    var y: Number
    var color: Number
    var alpha: Number
}

external interface SpriteSheetConfig {
    var frameWidth: Number
    var frameHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spacing: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpriteSheetFromAtlasConfig {
    var atlas: String
    var frame: String
    var frameWidth: Number
    var frameHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spacing: Number?
        get() = definedExternally
        set(value) = definedExternally
}