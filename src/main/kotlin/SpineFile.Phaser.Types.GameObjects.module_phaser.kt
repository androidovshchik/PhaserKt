@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.GameObjects

import Phaser.GameObjects.Components.TransformMatrix
import ru.androidovshchik.InvalidName

external interface Face {
    var vertex1: Vertex
    var vertex2: Vertex
    var vertex3: Vertex
    var isCounterClockwise: Boolean
}

external interface GameObjectConfig {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flipX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var scrollFactor: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var origin: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var scaleMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blendMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var add: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetCalcMatrixResults {
    var camera: TransformMatrix
    var sprite: TransformMatrix
    var calc: TransformMatrix
}

external interface JSONGameObject {
    var name: String
    var type: String
    var x: Number
    var y: Number
    var scale: Any?
    @InvalidName
    var scale_x: Number
    @InvalidName
    var scale_y: Number
    var origin: Any?
    @InvalidName
    var origin_x: Number
    @InvalidName
    var origin_y: Number
    var flipX: Boolean
    var flipY: Boolean
    var rotation: Number
    var alpha: Number
    var visible: Boolean
    var scaleMode: Number
    var blendMode: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var textureKey: String
    var frameKey: String
    var data: Any?
}

external interface Vertex {
    var x: Number
    var y: Number
    var z: Number
    var normalX: Number
    var normalY: Number
    var normalZ: Number
    var u: Number
    var v: Number
    var alpha: Number
}