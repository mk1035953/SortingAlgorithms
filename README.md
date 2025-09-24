# SortingAlgorithms

A collection of classic sorting algorithms implemented for educational and practical purposes.

## Table of Contents

- [Overview](#overview)
- [Algorithms Included](#algorithms-included)
- [Algorithm Descriptions](#algorithm-descriptions)
- [License](#license)

## Overview

This repository contains implementations of various sorting algorithms. It serves as a resource for learning and comparing the performance and behavior of different sorting techniques.

## Algorithms Included

- Bubble Sort
- Selection Sort
- Insertion Sort
- Exchange Sort
- I Can't Believe It Can Sort
- Shell Sort
- Merge Sort
- Merge-Insertion Sort
- Quick Sort
- Heap Sort
- Intro Sort
- More to be added

## Algorithm Descriptions
- Bubble Sort - this is one of the most simple sorting algorithms, where it checks adjacent pairs in the array and swaps them if they are out of order
- Selection Sort - this is an easy to understand sorting algorithm, where it checks the array for the currently smallest one, and goes through the array to check increasingly greater elements. (Note: this results in the least amount of swaps)
- Insertion Sort - this is another easy to understand sorting algorithm, where it increases in index finding where each element would go in the sorted part in the list. (Note: this is one of the fastest with smaller moves in an array, whilst larger moves will take a long amount of time)
- Exchange Sort - this is an improvement of Selection Sort where instead of selecting the smallest element of the list and increasing as it goes, it exchanges the current index with increasingly smaller elements in the list
- The I Can't Believe It Can Sort - this a "joke" algorithm, it is a simple algorithm that is just a less efficient version of Exchange Sort
- Shell Sort - this is a more complex version of Insertion Sort, it is a gapped Insertion Sort where you have a series of gapsizes that slowly decrease into standard Insertion Sort, the point of the gap sizes is to get the larger moves out of the way, so that it mitigates the main drawback of the Insertion Sort, where massive moves will be significantly slower.
- Merge Sort - this is a faster sorting algorithm where you use the divide-and-conquer strategy to very quickly sort the array, this sort divides the array in half then sorts each half of the array recursively then merges them back together(Note: this results in quicker times at the cost of memory)
- Merge-Insertion Sort - this sorting algorithm is the standard merge sort, but it uses insertion sort to merge the two lists, this should theoretically be faster, however due to poor integration, it really isn't faster
- Quick Sort - this is one of if not the fastest sorting algorithms, and is one the most widely used for its speed, it set one element to be the pivot and partitions the array into numbers greater than the pivot and numbers less than the pivot, then puts the pivot in the middle and sorts the two partitioned sub-arrays recursively.(Note: Like Merge Sort it will also be using more memory, but it is worth it for the speed of the Sort)
- Heap Sort - this is a less common sorting algorithm, but it's algorithm is used in faster and more complex algorithms, this sorting algorithm makes an improvement to the array itself instead of just sorting an unknown unsorted array it turns the array into a heap, then takes the largest item in the heap, then reheaps the data going from largest to smallest
- Intro Sort - this is an incredibly fast algorithm at the cost of being more complex than most, it takes the benefits of three different sorting algorithms and combines it into one, it takes the speed and bulk of the algorithm from quick sort, and then has a maximum depth to the recursion, once it reaches that depth, it will then either do Insertion Sort or Heap sort, depending on the size of the array
## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
