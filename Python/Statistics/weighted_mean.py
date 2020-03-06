

def weighted_mean(number_of_elements, elements, weights):
    aux = sum([a*b for a, b in zip(elements, weights)])
    return aux/sum(weights)


if __name__ == '__main__':
    n = int(input())
    numbers = list(map(int, input().split()))
    weights = list(map(int, input().split()))

    print("{:.1f}".format(weighted_mean(n, numbers, weights)))
