

def median(elements):
    elements_number = len(elements)
    if elements_number % 2 == 0:
        return print("{:.0f}".format((elements[elements_number//2-1]+elements[elements_number//2])/2))
    else:
        return print("{:.0f}".format(elements[elements_number//2]))


if __name__ == '__main__':
    n = int(input())
    numbers = list(map(int, input().split()))
    numbers.sort()

    median(numbers[:n//2])
    median(numbers)
    if n % 2 == 0:
        median(numbers[n//2:])
    else:
        median(numbers[n//2+1:])
