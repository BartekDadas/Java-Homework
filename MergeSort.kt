
//fun main() {
//    val numbers = intArrayOf(3,12,4,56,23,90,71,10)
//    val sortedNumbers = mergesort(numbers)
//    println("$sortedNumbers")
//}
//
///**
//*MergeSort
//*/
//fun mergesort(arr: IntArray): IntArray {
//    if (arr.size <= 1) {
//        return arr
//    }
//    while (arr.size >= 2) {
//        var split = arr.size / 2
//        var array1 = intArrayOf(0, split)
//        var array2 = intArrayOf(split, arr.size)
//
//        return merge(mergesort(array1), mergesort(array2))
//    }
//}
//
//fun merge(array1: IntArray, array2: IntArray): IntArray {
//    var newArray = intArrayOf()
//    var index1 = 0
//    var index2 = 0
//    while ((index1 < array1.count() && index2 < array2.count())) {
//        if (array1[index1] <= array2[index2]) {
//            newArray.add(array1[index1])
//            index1++
//        } else {
//            newArray.add(array2[index2])
//            index2++
//        }
//    }
//    while (index1 < array1.size) {
//        newArray.add(array1[index1])
//        index1++
//    }
//    while (index2 < array2.size) {
//        newArray.add(array2[index2])
//        index2++
//    }
//    return newArray.toIntArray()
//    }
//}







