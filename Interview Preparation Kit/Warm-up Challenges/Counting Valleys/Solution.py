

def counting_valleys(n, s):

    valleys_sum = 0
    aux = 0
    for step in s:
        if step == "U":
            aux += 1
        else:
            aux -= 1

        if aux == 0 and step == "U":
            valleys_sum += 1

    return valleys_sum


print(counting_valleys(8, "UDDDUDUU"))
