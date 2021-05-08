@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Renderer.WebGL

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
import tsstdlib.GLenum
import Phaser.Game

external interface RenderTargetConfig {
    var scale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minFilter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var autoClear: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebGLConst {
    var enum: GLenum
    var size: Number
}

external interface WebGLPipelineAttribute {
    var name: String
    var size: Number
    var type: GLenum
    var offset: Number
    var normalized: Boolean
    var enabled: Boolean
    var location: Number
}

external interface WebGLPipelineAttributesConfig {
    var name: String
    var size: Number
    var type: WebGLConst
    var normalized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebGLPipelineConfig {
    var game: Game
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var topology: GLenum?
        get() = definedExternally
        set(value) = definedExternally
    var vertShader: String?
        get() = definedExternally
        set(value) = definedExternally
    var fragShader: String?
        get() = definedExternally
        set(value) = definedExternally
    var batchSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var vertexSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var vertices: dynamic /* Array<Number>? | Float32Array? */
        get() = definedExternally
        set(value) = definedExternally
    var attributes: WebGLPipelineAttributesConfig?
        get() = definedExternally
        set(value) = definedExternally
    var shaders: Array<WebGLPipelineShaderConfig>?
        get() = definedExternally
        set(value) = definedExternally
    var forceZero: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderTarget: dynamic /* Boolean? | Number? | Array<Phaser.Types.Renderer.WebGL.RenderTargetConfig>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebGLPipelineShaderConfig {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var vertShader: String?
        get() = definedExternally
        set(value) = definedExternally
    var fragShader: String?
        get() = definedExternally
        set(value) = definedExternally
    var attributes: WebGLPipelineAttributesConfig?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebGLPipelineUniformsConfig {
    var name: String
    var location: WebGLUniformLocation
    var value1: Any
    var value2: Any
    var value3: Any
    var value4: Any
}