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
- More to be added

## Algorithm Descriptions
- Bubble Sort - this is one of the most simple sorting algorithms, where it checks adjacent pairs in the array and swaps them if they are out of order
- Selection Sort - this is an easy to understand sorting algorithm, where it checks the array for the currently smallest one, and goes through the array to check increasingly greater elements. (Note: this results in the least amount of swaps)
- Insertion Sort - this is another easy to understand sorting algorithm, where it increases in index finding where each element would go in the sorted part in the list. (Note: this is one of the fastest with smaller moves in an array, whilst larger moves will take a long amount of time)
- Exchange Sort - this is an improvement of Selection Sort where instead of selecting the smallest element of the list and increasing as it goes, it exchanges the current index with increasingly smaller elements in the list
- The I Can't Believe It Can Sort - this a "joke" algorithm, it is a simple algorithm that is just a less efficient version of Exchange Sort
- Shell Sort - this is a more complex version of Insertion Sort, it is a gapped Insertion Sort where you have a series of gapsizes that slowly decrease into standard Insertion Sort, the point of the gap sizes is to get the larger moves out of the way, so that it mitigates the main drawback of the Insertion Sort, where massive moves will be significantly slower.
## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
