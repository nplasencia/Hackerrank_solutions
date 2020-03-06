

def jumping_on_clouds(c):
    jumps, index = 0, 0

    while index < len(c)-1:

        if index+2 < len(c) and c[index+2] == 0:
            index += 1

        index += 1
        jumps += 1

    return jumps

print(jumping_on_clouds([0, 0, 1, 0, 0, 1, 0]))
