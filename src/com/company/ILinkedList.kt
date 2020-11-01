package com.company

interface ILinkedList<out E> : List<E> {
    fun <R> map(mapping: (E) -> R): ILinkedList<R>
}
