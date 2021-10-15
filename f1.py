# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

print("Приветусики")
print("Я Серёжа")
print("Кеса")
print("Изменяю ещё")
print('Hello world!')
import random
import numpy
import time


def generateMatrix(m = 50, n = 50, min_limit = -250, max_limit = 1010):
    """
    m - число строк матрицы;
    n - число столбцов матрицы;
    min_limit - минимальное значение генерируемого числа;
    max_limit - максимальное значение генерируемого числа;
    """
    matrix = numpy.empty((m, n))
    for i in range(m):
        for j in range(n):
            matrix[i][j] = random.randint(min_limit, max_limit)
    return matrix.astype(int)