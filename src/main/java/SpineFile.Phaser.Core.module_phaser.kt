@file:JsQualifier("Phaser.Core")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Core

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
import Phaser.Types.Core.GameConfig
import Phaser.Scale.ScaleModeType
import Phaser.Scale.CenterType
import Phaser.Types.Core.AudioConfig
import Phaser.Types.Core.FPSConfig
import Phaser.Types.Core.PipelineConfig
import Phaser.Display.Color
import Phaser.Types.Core.BootCallback
import Phaser.Types.Core.PhysicsConfig
import Phaser.Game
import Phaser.DOM.RequestAnimationFrame
import Phaser.Types.Core.TimeStepCallback

external open class Config(GameConfig: GameConfig = definedExternally) {
    open var width: dynamic /* Number | String */
    open var height: dynamic /* Number | String */
    open var zoom: dynamic /* Phaser.Scale.ZoomType | Number */
    open var parent: Any
    open var scaleMode: ScaleModeType
    open var expandParent: Boolean
    open var autoRound: Boolean
    open var autoCenter: CenterType
    open var resizeInterval: Number
    open var fullscreenTarget: dynamic /* HTMLElement | String */
    open var minWidth: Number
    open var maxWidth: Number
    open var minHeight: Number
    open var maxHeight: Number
    open var renderType: Number
    open var canvas: HTMLCanvasElement
    open var context: dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */
    open var canvasStyle: String
    open var customEnvironment: Boolean
    open var sceneConfig: Any?
    open var seed: Array<String>
    open var gameTitle: String
    open var gameURL: String
    open var gameVersion: String
    open var autoFocus: Boolean
    open var domCreateContainer: Boolean
    open var domBehindCanvas: Boolean
    open var inputKeyboard: Boolean
    open var inputKeyboardEventTarget: Any
    open var inputKeyboardCapture: Array<Number>
    open var inputMouse: dynamic /* Boolean? | Any? */
    open var inputMouseEventTarget: Any
    open var inputMousePreventDefaultDown: Boolean
    open var inputMousePreventDefaultUp: Boolean
    open var inputMousePreventDefaultMove: Boolean
    open var inputMousePreventDefaultWheel: Boolean
    open var inputTouch: Boolean
    open var inputTouchEventTarget: Any
    open var inputTouchCapture: Boolean
    open var inputActivePointers: Number
    open var inputSmoothFactor: Number
    open var inputWindowEvents: Boolean
    open var inputGamepad: Boolean
    open var inputGamepadEventTarget: Any
    open var disableContextMenu: Boolean
    open var audio: AudioConfig
    open var hideBanner: Boolean
    open var hidePhaser: Boolean
    open var bannerTextColor: String
    open var bannerBackgroundColor: Array<String>
    open var fps: FPSConfig
    open var pipeline: PipelineConfig
    open var antialias: Boolean
    open var antialiasGL: Boolean
    open var mipmapFilter: String
    open var desynchronized: Boolean
    open var roundPixels: Boolean
    open var pixelArt: Boolean
    open var transparent: Boolean
    open var clearBeforeRender: Boolean
    open var preserveDrawingBuffer: Boolean
    open var premultipliedAlpha: Boolean
    open var failIfMajorPerformanceCaveat: Boolean
    open var powerPreference: String
    open var batchSize: Number
    open var maxTextures: Number
    open var maxLights: Number
    open var backgroundColor: Color
    open var preBoot: BootCallback
    open var postBoot: BootCallback
    open var physics: PhysicsConfig
    open var defaultPhysicsSystem: dynamic /* Boolean | String */
    open var loaderBaseURL: String
    open var loaderPath: String
    open var loaderMaxParallelDownloads: Number
    open var loaderCrossOrigin: String?
    open var loaderResponseType: String
    open var loaderAsync: Boolean
    open var loaderUser: String
    open var loaderPassword: String
    open var loaderTimeout: Number
    open var loaderWithCredentials: Boolean
    open var installGlobalPlugins: Any
    open var installScenePlugins: Any
    open var defaultPlugins: Any
    open var defaultImage: String
    open var missingImage: String
    open var whiteImage: String
}

external fun CreateRenderer(game: Game)

external fun DebugHeader(game: Game)

external open class TimeStep(game: Game, config: FPSConfig) {
    open var game: Game
    open var raf: RequestAnimationFrame
    open var started: Boolean
    open var running: Boolean
    open var minFps: Number
    open var targetFps: Number
    open var actualFps: Number
    open var nextFpsUpdate: Number
    open var framesThisSecond: Number
    open var callback: TimeStepCallback
    open var forceSetTimeOut: Boolean
    open var time: Number
    open var startTime: Number
    open var lastTime: Number
    open var frame: Number
    open var inFocus: Boolean
    open var delta: Number
    open var deltaIndex: Number
    open var deltaHistory: Array<Number>
    open var deltaSmoothingMax: Number
    open var panicMax: Number
    open var rawDelta: Number
    open var now: Number
    open var smoothStep: Boolean
    open fun blur()
    open fun focus()
    open fun pause()
    open fun resume()
    open fun resetDelta()
    open fun start(callback: TimeStepCallback)
    open fun step()
    open fun tick()
    open fun sleep()
    open fun wake(seamless: Boolean = definedExternally)
    open fun getDuration(): Number
    open fun getDurationMS(): Number
    open fun stop(): TimeStep /* this */
    open fun destroy()
}

external fun VisibilityHandler(game: Game)