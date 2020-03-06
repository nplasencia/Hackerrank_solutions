

def mean(elements_number, elements):
    aux = 0
    for element in elements:
        aux += element
    return aux/elements_number


def median(elements_number, elements):
    if elements_number % 2 == 0:
        return (elements[elements_number//2-1]+elements[elements_number//2])/2
    else:
        return elements[elements_number//2]


def mode(elements):
    dic = {}
    max_value = [0, 0]
    for element in elements:
        try:
            dic[element] += 1
        except KeyError:
            dic[element] = 1

        if dic[element] > max_value[1]:
            max_value[0] = element
            max_value[1] = dic[element]

    return max_value[0]


if __name__ == '__main__':
    n = int(input())
    numbers = list(map(int, input().split()))
    numbers.sort()

    print(mean(n, numbers))
    print(median(n, numbers))
    print(mode(numbers))
