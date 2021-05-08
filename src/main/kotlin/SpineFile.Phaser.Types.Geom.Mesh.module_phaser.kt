@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Types.Geom.Mesh

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
import Phaser.GameObjects.Mesh
import Phaser.Geom.Mesh.Face
import Phaser.Geom.Mesh.Vertex
import Phaser.Types.Math.Vector3Like

external interface GenerateGridConfig {
    var texture: dynamic /* String | Phaser.Textures.Texture */
        get() = definedExternally
        set(value) = definedExternally
    var frame: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var mesh: Mesh?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var widthSegments: Number?
        get() = definedExternally
        set(value) = definedExternally
    var heightSegments: Number?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colors: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var alphas: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var tile: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isOrtho: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenerateGridVertsResult {
    var verts: Array<Number>
    var indices: Array<Number>
    var uvs: Array<Number>
    var colors: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var alphas: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenerateVertsResult {
    var faces: Array<Face>
    var vertices: Array<Vertex>
}

external interface OBJData {
    var materialLibraries: Array<String>
    var materials: Any?
    var models: Array<OBJModel>
}

external interface OBJFace {
    var group: String
    var material: String
    var vertices: Array<OBJFaceVertice>
}

external interface OBJFaceVertice {
    var textureCoordsIndex: Number
    var vertexIndex: Number
    var vertexNormalIndex: Number
}

external interface OBJModel {
    var faces: Array<OBJFace>
    var name: String
    var textureCoords: Array<UV>
    var vertexNormals: Array<Vector3Like>
    var vertices: Array<Vector3Like>
}

external interface UV {
    var u: Number
    var v: Number
    var w: Number
}