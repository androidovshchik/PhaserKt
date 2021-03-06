package ru.androidovshchik

@Retention(AnnotationRetention.SOURCE)
annotation class NotImplemented

@Retention(AnnotationRetention.SOURCE)
annotation class InvalidName

@Retention(AnnotationRetention.SOURCE)
annotation class InexactType(val type: String)

@Retention(AnnotationRetention.SOURCE)
annotation class MissingClass(val name: String)