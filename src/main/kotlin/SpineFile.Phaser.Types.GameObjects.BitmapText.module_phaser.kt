@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.GameObjects.BitmapText

import Phaser.GameObjects.DynamicBitmapText
import ru.androidovshchik.InvalidName

external interface `T$4` {
    @nativeGetter
    operator fun get(key: String): Number?
    @nativeSetter
    operator fun set(key: String, value: Number)
}

external interface BitmapFontCharacterData {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var centerX: Number
    var centerY: Number
    var xOffset: Number
    var yOffset: Number
    var u0: Number
    var v0: Number
    var u1: Number
    var v1: Number
    var data: Any?
    var kerning: `T$4`
}

external interface `T$5` {
    @nativeGetter
    operator fun get(key: Number): BitmapFontCharacterData?
    @nativeSetter
    operator fun set(key: Number, value: BitmapFontCharacterData)
}

external interface BitmapFontData {
    var font: String
    var size: Number
    var lineHeight: Number
    var retroFont: Boolean
    var chars: `T$5`
}

external interface BitmapTextCharacter {
    var i: Number
    var char: String
    var code: Number
    var x: Number
    var y: Number
    var w: Number
    var h: Number
    var t: Number
    var r: Number
    var b: Number
    var line: Number
    var glyph: BitmapFontCharacterData
}

external interface `T$6` {
    var font: String?
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: dynamic /* Number? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface BitmapTextLines {
    var shortest: Number
    var longest: Number
    var height: Number
    var lengths: Array<Number>
}

external interface BitmapTextSize {
    var global: GlobalBitmapTextSize
    var local: LocalBitmapTextSize
    var lines: BitmapTextLines
    var characters: Array<BitmapTextCharacter>
    var words: Array<BitmapTextWord>
    var scale: Number
    var scaleX: Number
    var scaleY: Number
    var wrappedText: String
}

external interface BitmapTextWord {
    var x: Number
    var y: Number
    var w: Number
    var h: Number
    var i: Number
    var word: String
}

external interface DisplayCallbackConfig {
    var parent: DynamicBitmapText
    var tint: TintConfig
    var index: Number
    var charCode: Number
    var x: Number
    var y: Number
    var scale: Number
    var rotation: Number
    var data: Any
}

typealias DisplayCallback = (display: DisplayCallbackConfig) -> Unit

external interface GlobalBitmapTextSize {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface `T$7` {
    var font: String
    var text: String
    var fontSize: Number
    var letterSpacing: Number
    var align: Number
}

external interface LocalBitmapTextSize {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface RetroFontConfig {
    var image: String
    @InvalidName
    var offset_x: Number
    @InvalidName
    var offset_y: Number
    var width: Number
    var height: Number
    var chars: String
    var charsPerRow: Number
    @InvalidName
    var spacing_x: Number
    @InvalidName
    var spacing_y: Number
    var lineSpacing: Number
}

external interface TintConfig {
    var topLeft: Number
    var topRight: Number
    var bottomLeft: Number
    var bottomRight: Number
}