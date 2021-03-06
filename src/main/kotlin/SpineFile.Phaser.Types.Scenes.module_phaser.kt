@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Scenes

import Phaser.Scene
import Phaser.Types.Core.LoaderConfig
import Phaser.Types.Core.PhysicsConfig
import ru.androidovshchik.InvalidName

external interface CreateSceneFromObjectConfig {
    var init: SceneInitCallback?
        get() = definedExternally
        set(value) = definedExternally
    var preload: ScenePreloadCallback?
        get() = definedExternally
        set(value) = definedExternally
    var create: SceneCreateCallback?
        get() = definedExternally
        set(value) = definedExternally
    var update: SceneUpdateCallback?
        get() = definedExternally
        set(value) = definedExternally
    var extend: Any?
        get() = definedExternally
        set(value) = definedExternally
    @InvalidName
    var extend_data: Any?
        get() = definedExternally
        set(value) = definedExternally
}

typealias SceneCreateCallback = (self: Scene, data: Any?) -> Unit

typealias SceneInitCallback = (self: Scene, data: Any?) -> Unit

typealias ScenePreloadCallback = (self: Scene) -> Unit

external interface SceneTransitionConfig {
    var target: String
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sleep: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var remove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var allowInput: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var moveAbove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var moveBelow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdate: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdateScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
}

typealias SceneUpdateCallback = (self: Scene) -> Unit

external interface `T$16` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

external interface SettingsConfig {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pack: dynamic /* Boolean? | Phaser.Types.Loader.FileTypes.PackFileSection? */
        get() = definedExternally
        set(value) = definedExternally
    var cameras: dynamic /* Phaser.Types.Cameras.Scene2D.JSONCamera? | Array<Phaser.Types.Cameras.Scene2D.JSONCamera>? */
        get() = definedExternally
        set(value) = definedExternally
    var map: `T$16`?
        get() = definedExternally
        set(value) = definedExternally
    var mapAdd: `T$16`?
        get() = definedExternally
        set(value) = definedExternally
    var physics: PhysicsConfig?
        get() = definedExternally
        set(value) = definedExternally
    var loader: LoaderConfig?
        get() = definedExternally
        set(value) = definedExternally
    var plugins: dynamic /* Boolean? | Any? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SettingsObject {
    var status: Number
    var key: String
    var active: Boolean
    var visible: Boolean
    var isBooted: Boolean
    var isTransition: Boolean
    var transitionFrom: Scene
    var transitionDuration: Number
    var transitionAllowInput: Boolean
    var data: Any?
    var pack: dynamic /* Boolean | Phaser.Types.Loader.FileTypes.PackFileSection */
        get() = definedExternally
        set(value) = definedExternally
    var cameras: dynamic /* Phaser.Types.Cameras.Scene2D.JSONCamera | Array<Phaser.Types.Cameras.Scene2D.JSONCamera> */
        get() = definedExternally
        set(value) = definedExternally
    var map: `T$16`
    var physics: PhysicsConfig
    var loader: LoaderConfig
    var plugins: dynamic /* Boolean | Any */
        get() = definedExternally
        set(value) = definedExternally
}