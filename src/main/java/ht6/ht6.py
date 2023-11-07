class Task:

    @staticmethod
    def find_average(numbers):
        if not numbers:
            return 0
        return sum(numbers) / len(numbers)

    @staticmethod
    def compare_averages(numbers_1, numbers_2):
        avg_1 = Task.find_average(numbers_1)
        avg_2 = Task.find_average(numbers_2)
        if avg_1 > avg_2:
            return "Первый список имеет большее среднее значение"
        elif avg_1 < avg_2:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"
