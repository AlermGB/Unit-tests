import pytest

from ht6 import Task


def test_average():
    # Проверка функции вычисления среднего значения для списка.
    assert Task.find_average([1, 2, 3, 4, 5]) == 3, "не сработал в случае нескольких значений в списке"
    assert Task.find_average([]) == 0, "не сработал в случае пустого массива"
    assert Task.find_average([1]) == 1, "не сработал в случае одного значения"

    # Проверка функции сравнения средних значений.
    assert Task.compare_averages([1, 2, 3], [1, 2, 3]) == "Средние значения равны",\
        "не сработало при равенстве списков."
    assert Task.compare_averages([1, 2, 3], [4, 5, 6]) == "Второй список имеет большее среднее значение",\
        "не сработало при большем втором списке."
    assert Task.compare_averages([4, 5, 6], [1, 2, 3]) == "Первый список имеет большее среднее значение",\
        "не сработало при большем первом списке."
    assert Task.compare_averages([], [1, 2, 3]) == "Второй список имеет большее среднее значение", \
        "не сработало при сравнении с пустым списком"
    assert Task.compare_averages([-1, -2, -3], [1, 2, 3]) == "Второй список имеет большее среднее значение", \
        "не сработало при сравнении с отрицательным значением среднего"
