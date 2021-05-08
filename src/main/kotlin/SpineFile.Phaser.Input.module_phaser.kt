@file:JsQualifier("Phaser.Input")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Input

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
import Phaser.GameObjects.GameObject
import Phaser.Types.Input.HitAreaCallback
import Phaser.Types.Input.InteractiveObject
import Phaser.Textures.TextureManager
import Phaser.Game
import Phaser.Scale.ScaleManager
import Phaser.Core.Config
import Phaser.Events.EventEmitter
import Phaser.Input.Keyboard.KeyboardManager
import Phaser.Input.Mouse.MouseManager
import Phaser.Input.Touch.TouchManager
import Phaser.Cameras.Scene2D.Camera
import Phaser.Scene
import Phaser.Input.Gamepad.GamepadPlugin
import Phaser.Scenes.Systems
import Phaser.Types.Scenes.SettingsObject
import Phaser.GameObjects.DisplayList
import Phaser.Cameras.Scene2D.CameraManager
import Phaser.Types.Input.InputConfiguration
import Phaser.Input.Keyboard.KeyboardPlugin
import Phaser.Math.Vector2

external var MOUSE_DOWN: Number

external var MOUSE_MOVE: Number

external var MOUSE_UP: Number

external var TOUCH_START: Number

external var TOUCH_MOVE: Number

external var TOUCH_END: Number

external var POINTER_LOCK_CHANGE: Number

external var TOUCH_CANCEL: Number

external var MOUSE_WHEEL: Number

external fun CreateInteractiveObject(gameObject: GameObject, hitArea: Any, hitAreaCallback: HitAreaCallback): InteractiveObject

external fun CreatePixelPerfectHandler(textureManager: TextureManager, alphaTolerance: Number): Function<*>

external open class InputManager(game: Game, config: Any?) {
    open var game: Game
    open var scaleManager: ScaleManager
    open var canvas: HTMLCanvasElement
    open var config: Config
    open var enabled: Boolean
    open var events: EventEmitter
    open var isOver: Boolean
    open var defaultCursor: String
    open var keyboard: KeyboardManager
    open var mouse: MouseManager
    open var touch: TouchManager
    open var pointers: Array<Pointer>
    open var pointersTotal: Number
    open var mousePointer: Pointer
    open var activePointer: Pointer
    open var globalTopOnly: Boolean
    open var time: Number
    open fun boot()
    open fun setDefaultCursor(cursor: String)
    open fun addPointer(quantity: Number = definedExternally): Array<Pointer>
    open fun updateInputPlugins(type: Number, pointers: Array<Pointer>)
    open fun hitTest(pointer: Pointer, gameObjects: Array<Any>, camera: Camera, output: Array<Any> = definedExternally): Array<Any>
    open fun pointWithinHitArea(gameObject: GameObject, x: Number, y: Number): Boolean
    open fun pointWithinInteractiveObject(obj: InteractiveObject, x: Number, y: Number): Boolean
    open fun transformPointer(pointer: Pointer, pageX: Number, pageY: Number, wasMove: Boolean)
    open fun destroy()
}

external open class InputPlugin(scene: Scene) : EventEmitter {
    open var gamepad: GamepadPlugin
    open var scene: Scene
    open var systems: Systems
    open var settings: SettingsObject
    open var manager: InputManager
    open var enabled: Boolean
    open var displayList: DisplayList
    open var cameras: CameraManager
    open var mouse: MouseManager
    open var topOnly: Boolean
    open var pollRate: Number
    open var dragDistanceThreshold: Number
    open var dragTimeThreshold: Number
    open fun isActive(): Boolean
    open fun updatePoll(time: Number, delta: Number): Boolean
    open fun clear(gameObject: GameObject, skipQueue: Boolean = definedExternally): GameObject
    open fun disable(gameObject: GameObject)
    open fun enable(gameObject: GameObject, hitArea: InputConfiguration = definedExternally, hitAreaCallback: HitAreaCallback = definedExternally, dropZone: Boolean = definedExternally): InputPlugin /* this */
    open fun enable(gameObject: GameObject): InputPlugin /* this */
    open fun enable(gameObject: GameObject, hitArea: InputConfiguration = definedExternally): InputPlugin /* this */
    open fun enable(gameObject: GameObject, hitArea: InputConfiguration = definedExternally, hitAreaCallback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun enable(gameObject: GameObject, hitArea: Any = definedExternally, hitAreaCallback: HitAreaCallback = definedExternally, dropZone: Boolean = definedExternally): InputPlugin /* this */
    open fun enable(gameObject: GameObject, hitArea: Any = definedExternally): InputPlugin /* this */
    open fun enable(gameObject: GameObject, hitArea: Any = definedExternally, hitAreaCallback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun hitTestPointer(pointer: Pointer): Array<GameObject>
    open fun getDragState(pointer: Pointer): Number
    open fun setDragState(pointer: Pointer, state: Number)
    open fun setDraggable(gameObjects: GameObject, value: Boolean = definedExternally): InputPlugin /* this */
    open fun setDraggable(gameObjects: GameObject): InputPlugin /* this */
    open fun setDraggable(gameObjects: Array<GameObject>, value: Boolean = definedExternally): InputPlugin /* this */
    open fun setDraggable(gameObjects: Array<GameObject>): InputPlugin /* this */
    open fun makePixelPerfect(alphaTolerance: Number = definedExternally): Function<*>
    open fun setHitArea(gameObjects: GameObject, hitArea: InputConfiguration = definedExternally, hitAreaCallback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitArea(gameObjects: GameObject): InputPlugin /* this */
    open fun setHitArea(gameObjects: GameObject, hitArea: InputConfiguration = definedExternally): InputPlugin /* this */
    open fun setHitArea(gameObjects: GameObject, hitArea: Any = definedExternally, hitAreaCallback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitArea(gameObjects: GameObject, hitArea: Any = definedExternally): InputPlugin /* this */
    open fun setHitArea(gameObjects: Array<GameObject>, hitArea: InputConfiguration = definedExternally, hitAreaCallback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitArea(gameObjects: Array<GameObject>): InputPlugin /* this */
    open fun setHitArea(gameObjects: Array<GameObject>, hitArea: InputConfiguration = definedExternally): InputPlugin /* this */
    open fun setHitArea(gameObjects: Array<GameObject>, hitArea: Any = definedExternally, hitAreaCallback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitArea(gameObjects: Array<GameObject>, hitArea: Any = definedExternally): InputPlugin /* this */
    open fun setHitAreaCircle(gameObjects: GameObject, x: Number, y: Number, radius: Number, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaCircle(gameObjects: GameObject, x: Number, y: Number, radius: Number): InputPlugin /* this */
    open fun setHitAreaCircle(gameObjects: Array<GameObject>, x: Number, y: Number, radius: Number, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaCircle(gameObjects: Array<GameObject>, x: Number, y: Number, radius: Number): InputPlugin /* this */
    open fun setHitAreaEllipse(gameObjects: GameObject, x: Number, y: Number, width: Number, height: Number, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaEllipse(gameObjects: GameObject, x: Number, y: Number, width: Number, height: Number): InputPlugin /* this */
    open fun setHitAreaEllipse(gameObjects: Array<GameObject>, x: Number, y: Number, width: Number, height: Number, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaEllipse(gameObjects: Array<GameObject>, x: Number, y: Number, width: Number, height: Number): InputPlugin /* this */
    open fun setHitAreaFromTexture(gameObjects: GameObject, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaFromTexture(gameObjects: GameObject): InputPlugin /* this */
    open fun setHitAreaFromTexture(gameObjects: Array<GameObject>, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaFromTexture(gameObjects: Array<GameObject>): InputPlugin /* this */
    open fun setHitAreaRectangle(gameObjects: GameObject, x: Number, y: Number, width: Number, height: Number, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaRectangle(gameObjects: GameObject, x: Number, y: Number, width: Number, height: Number): InputPlugin /* this */
    open fun setHitAreaRectangle(gameObjects: Array<GameObject>, x: Number, y: Number, width: Number, height: Number, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaRectangle(gameObjects: Array<GameObject>, x: Number, y: Number, width: Number, height: Number): InputPlugin /* this */
    open fun setHitAreaTriangle(gameObjects: GameObject, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaTriangle(gameObjects: GameObject, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number): InputPlugin /* this */
    open fun setHitAreaTriangle(gameObjects: Array<GameObject>, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, callback: HitAreaCallback = definedExternally): InputPlugin /* this */
    open fun setHitAreaTriangle(gameObjects: Array<GameObject>, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number): InputPlugin /* this */
    open fun enableDebug(gameObject: GameObject, color: Number = definedExternally): InputPlugin /* this */
    open fun removeDebug(gameObject: GameObject): InputPlugin /* this */
    open fun setPollAlways(): InputPlugin /* this */
    open fun setPollOnMove(): InputPlugin /* this */
    open fun setPollRate(value: Number): InputPlugin /* this */
    open fun setGlobalTopOnly(value: Boolean): InputPlugin /* this */
    open fun setTopOnly(value: Boolean): InputPlugin /* this */
    open fun sortGameObjects(gameObjects: Array<GameObject>, pointer: Pointer): Array<GameObject>
    open fun sortDropZones(gameObjects: Array<GameObject>): Array<GameObject>
    open fun stopPropagation(): InputPlugin /* this */
    open fun addPointer(quantity: Number = definedExternally): Array<Pointer>
    open fun setDefaultCursor(cursor: String): InputPlugin /* this */
    open var x: Number
    open var y: Number
    open var isOver: Boolean
    open var mousePointer: Pointer
    open var activePointer: Pointer
    open var pointer1: Pointer
    open var pointer2: Pointer
    open var pointer3: Pointer
    open var pointer4: Pointer
    open var pointer5: Pointer
    open var pointer6: Pointer
    open var pointer7: Pointer
    open var pointer8: Pointer
    open var pointer9: Pointer
    open var pointer10: Pointer
    open var keyboard: KeyboardPlugin
}

external open class Pointer(manager: InputManager, id: Number) {
    open var manager: InputManager
    open var id: Number
    open var event: dynamic /* TouchEvent | MouseEvent */
    open var downElement: Any
    open var upElement: Any
    open var camera: Camera
    open var button: Number
    open var buttons: Number
    open var position: Vector2
    open var prevPosition: Vector2
    open var velocity: Vector2
    open var angle: Number
    open var distance: Number
    open var smoothFactor: Number
    open var motionFactor: Number
    open var worldX: Number
    open var worldY: Number
    open var moveTime: Number
    open var downX: Number
    open var downY: Number
    open var downTime: Number
    open var upX: Number
    open var upY: Number
    open var upTime: Number
    open var primaryDown: Boolean
    open var isDown: Boolean
    open var wasTouch: Boolean
    open var wasCanceled: Boolean
    open var movementX: Number
    open var movementY: Number
    open var identifier: Number
    open var pointerId: Number
    open var active: Boolean
    open var locked: Boolean
    open var deltaX: Number
    open var deltaY: Number
    open var deltaZ: Number
    open fun updateWorldPoint(camera: Camera): Pointer /* this */
    open fun positionToCamera(camera: Camera, output: Vector2? = definedExternally): dynamic /* Phaser.Math.Vector2? | Any? */
    open fun positionToCamera(camera: Camera): dynamic /* Phaser.Math.Vector2? | Any? */
    open fun positionToCamera(camera: Camera, output: Any? = definedExternally): dynamic /* Phaser.Math.Vector2? | Any? */
    open fun noButtonDown(): Boolean
    open fun leftButtonDown(): Boolean
    open fun rightButtonDown(): Boolean
    open fun middleButtonDown(): Boolean
    open fun backButtonDown(): Boolean
    open fun forwardButtonDown(): Boolean
    open fun leftButtonReleased(): Boolean
    open fun rightButtonReleased(): Boolean
    open fun middleButtonReleased(): Boolean
    open fun backButtonReleased(): Boolean
    open fun forwardButtonReleased(): Boolean
    open fun getDistance(): Number
    open fun getDistanceX(): Number
    open fun getDistanceY(): Number
    open fun getDuration(): Number
    open fun getAngle(): Number
    open fun getInterpolatedPosition(steps: Number = definedExternally, out: Array<Any> = definedExternally): Array<Any>
    open fun destroy()
    open var x: Number
    open var y: Number
    open var time: Number
}