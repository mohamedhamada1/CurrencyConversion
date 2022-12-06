package ae.adres.dari.core.utils

fun <T> List<T>.filterIndices(predicate: (T) -> Boolean): List<Int> {
    val indices = ArrayList<Int>(size)

    foldIndexed(indices) { index, acc, t ->
        if (predicate(t)) acc.add(index)
        acc
    }

    return indices
}

fun <T> List<T>.getAll(indices: List<Int>): List<T> =
    indices.map { this[it] }
