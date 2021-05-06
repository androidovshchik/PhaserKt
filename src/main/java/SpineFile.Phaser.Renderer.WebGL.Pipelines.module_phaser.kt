@file:JsQualifier("Phaser.Renderer.WebGL.Pipelines")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Renderer.WebGL.Pipelines

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
import Phaser.Types.Renderer.WebGL.WebGLPipelineConfig
import Phaser.GameObjects.GameObject
import Phaser.Cameras.Scene2D.Camera
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.GameObjects.Components.TransformMatrix
import Phaser.Types.Math.Vector2Like
import Phaser.GameObjects.Image
import Phaser.GameObjects.Sprite
import Phaser.Textures.Frame
import Phaser.GameObjects.PointLight
import Phaser.Display.ColorMatrix
import Phaser.Renderer.WebGL.RenderTarget
import Phaser.Renderer.WebGL.WebGLShader

external open class BitmapMaskPipeline(config: WebGLPipelineConfig) : WebGLPipeline {
    open fun beginMask(mask: GameObject, maskedObject: GameObject, camera: Camera)
    open fun endMask(mask: GameObject)
}

external var BITMAPMASK_PIPELINE: String

external var LIGHT_PIPELINE: String

external var POINTLIGHT_PIPELINE: String

external var SINGLE_PIPELINE: String

external var MULTI_PIPELINE: String

external var ROPE_PIPELINE: String

external var GRAPHICS_PIPELINE: String

external var POSTFX_PIPELINE: String

external var UTILITY_PIPELINE: String

external open class GraphicsPipeline(config: WebGLPipelineConfig) : WebGLPipeline {
    open var calcMatrix: TransformMatrix
    open fun batchFillRect(x: Number, y: Number, width: Number, height: Number, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchFillTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchStrokeTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, lineWidth: Number, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchFillPath(path: Array<Vector2Like>, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchStrokePath(path: Array<Vector2Like>, lineWidth: Number, pathOpen: Boolean, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchLine(ax: Number, ay: Number, bx: Number, by: Number, aLineWidth: Number, bLineWidth: Number, index: Number, closePath: Boolean, currentMatrix: TransformMatrix, parentMatrix: TransformMatrix)
    open fun batchVert(x: Number, y: Number, tint: Number)
    override fun destroy(): GraphicsPipeline /* this */
}

external open class LightPipeline(config: WebGLPipelineConfig) : MultiPipeline {
    open var defaultNormalMap: Any?
    open var lightsActive: Boolean
    override fun boot()
    open fun setNormalMapRotation(rotation: Number)
    open fun getNormalMap(gameObject: GameObject = definedExternally): WebGLTexture
    override fun batchSprite(gameObject: Image, camera: Camera, parentTransformMatrix: TransformMatrix)
    override fun batchSprite(gameObject: Image, camera: Camera)
    override fun batchSprite(gameObject: Sprite, camera: Camera, parentTransformMatrix: TransformMatrix)
    override fun batchSprite(gameObject: Sprite, camera: Camera)
    override fun batchTexture(gameObject: GameObject, texture: WebGLTexture, textureWidth: Number, textureHeight: Number, srcX: Number, srcY: Number, srcWidth: Number, srcHeight: Number, scaleX: Number, scaleY: Number, rotation: Number, flipX: Boolean, flipY: Boolean, scrollFactorX: Number, scrollFactorY: Number, displayOriginX: Number, displayOriginY: Number, frameX: Number, frameY: Number, frameWidth: Number, frameHeight: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Number, uOffset: Number, vOffset: Number, camera: Camera, parentTransformMatrix: TransformMatrix, skipFlip: Boolean, textureUnit: Number)
    override fun batchTextureFrame(frame: Frame, x: Number, y: Number, tint: Number, alpha: Number, transformMatrix: TransformMatrix, parentTransformMatrix: TransformMatrix)
}

external open class MultiPipeline(config: WebGLPipelineConfig) : WebGLPipeline {
    open fun bind(): MultiPipeline /* this */
    open fun batchSprite(gameObject: Image, camera: Camera, parentTransformMatrix: TransformMatrix = definedExternally)
    open fun batchSprite(gameObject: Image, camera: Camera)
    open fun batchSprite(gameObject: Sprite, camera: Camera, parentTransformMatrix: TransformMatrix = definedExternally)
    open fun batchSprite(gameObject: Sprite, camera: Camera)
    open fun batchTexture(gameObject: GameObject, texture: WebGLTexture, textureWidth: Number, textureHeight: Number, srcX: Number, srcY: Number, srcWidth: Number, srcHeight: Number, scaleX: Number, scaleY: Number, rotation: Number, flipX: Boolean, flipY: Boolean, scrollFactorX: Number, scrollFactorY: Number, displayOriginX: Number, displayOriginY: Number, frameX: Number, frameY: Number, frameWidth: Number, frameHeight: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Number, uOffset: Number, vOffset: Number, camera: Camera, parentTransformMatrix: TransformMatrix, skipFlip: Boolean = definedExternally, textureUnit: Number = definedExternally)
    open fun batchTextureFrame(frame: Frame, x: Number, y: Number, tint: Number, alpha: Number, transformMatrix: TransformMatrix, parentTransformMatrix: TransformMatrix = definedExternally)
}

external open class PointLightPipeline(config: WebGLPipelineConfig) : WebGLPipeline {
    open fun batchPointLight(light: PointLight, camera: Camera, x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, lightX: Number, lightY: Number)
    open fun batchLightVert(x: Number, y: Number, lightX: Number, lightY: Number, radius: Number, attenuation: Number, r: Number, g: Number, b: Number, a: Number)
}

external open class PostFXPipeline(config: WebGLPipelineConfig) : WebGLPipeline {
    open var gameObject: GameObject
    open var colorMatrix: ColorMatrix
    open var fullFrame1: RenderTarget
    open var fullFrame2: RenderTarget
    open var halfFrame1: RenderTarget
    open var halfFrame2: RenderTarget
    open fun copyFrame(source: RenderTarget, target: RenderTarget = definedExternally, brightness: Number = definedExternally, clear: Boolean = definedExternally, clearAlpha: Boolean = definedExternally)
    open fun copyToGame(source: RenderTarget)
    open fun drawFrame(source: RenderTarget, target: RenderTarget = definedExternally, clearAlpha: Boolean = definedExternally)
    open fun blendFrames(source1: RenderTarget, source2: RenderTarget, target: RenderTarget = definedExternally, strength: Number = definedExternally, clearAlpha: Boolean = definedExternally)
    open fun blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: RenderTarget = definedExternally, strength: Number = definedExternally, clearAlpha: Boolean = definedExternally)
    open fun clearFrame(target: RenderTarget, clearAlpha: Boolean = definedExternally)
    open fun blitFrame(source: RenderTarget, target: RenderTarget, brightness: Number = definedExternally, clear: Boolean = definedExternally, clearAlpha: Boolean = definedExternally, eraseMode: Boolean = definedExternally)
    open fun copyFrameRect(source: RenderTarget, target: RenderTarget, x: Number, y: Number, width: Number, height: Number, clear: Boolean = definedExternally, clearAlpha: Boolean = definedExternally)
    open fun bindAndDraw(source: RenderTarget, target: RenderTarget = definedExternally, clear: Boolean = definedExternally, clearAlpha: Boolean = definedExternally, currentShader: WebGLShader = definedExternally)
}

external open class RopePipeline(config: WebGLPipelineConfig) : MultiPipeline

external open class SinglePipeline(config: WebGLPipelineConfig) : MultiPipeline

external open class UtilityPipeline(config: WebGLPipelineConfig) : WebGLPipeline {
    open var colorMatrix: ColorMatrix
    open var copyShader: WebGLShader
    open var addShader: WebGLShader
    open var linearShader: WebGLShader
    open var colorMatrixShader: WebGLShader
    open var fullFrame1: RenderTarget
    open var fullFrame2: RenderTarget
    open var halfFrame1: RenderTarget
    open var halfFrame2: RenderTarget
    open fun copyFrame(source: RenderTarget, target: RenderTarget = definedExternally, brightness: Number = definedExternally, clear: Boolean = definedExternally, clearAlpha: Boolean = definedExternally)
    open fun blitFrame(source: RenderTarget, target: RenderTarget, brightness: Number = definedExternally, clear: Boolean = definedExternally, clearAlpha: Boolean = definedExternally, eraseMode: Boolean = definedExternally)
    open fun copyFrameRect(source: RenderTarget, target: RenderTarget, x: Number, y: Number, width: Number, height: Number, clear: Boolean = definedExternally, clearAlpha: Boolean = definedExternally)
    open fun copyToGame(source: RenderTarget)
    open fun drawFrame(source: RenderTarget, target: RenderTarget = definedExternally, clearAlpha: Boolean = definedExternally, colorMatrix: ColorMatrix = definedExternally)
    open fun blendFrames(source1: RenderTarget, source2: RenderTarget, target: RenderTarget = definedExternally, strength: Number = definedExternally, clearAlpha: Boolean = definedExternally, blendShader: WebGLShader = definedExternally)
    open fun blendFramesAdditive(source1: RenderTarget, source2: RenderTarget, target: RenderTarget = definedExternally, strength: Number = definedExternally, clearAlpha: Boolean = definedExternally)
    open fun clearFrame(target: RenderTarget, clearAlpha: Boolean = definedExternally)
    open fun setUVs(uA: Number, vA: Number, uB: Number, vB: Number, uC: Number, vC: Number, uD: Number, vD: Number)
    open fun setTargetUVs(source: RenderTarget, target: RenderTarget)
    open fun flipX()
    open fun flipY()
    open fun resetUVs()
}