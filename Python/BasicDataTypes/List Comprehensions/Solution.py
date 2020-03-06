

def generate_coordinates(x, y, z, n):

    """
    You are given three integers X, Y and Z representing the dimensions of a cuboid along with an integer N.
    You have to print a list of all possible coordinates given by (i, j, k) on a 3D grid where the sum of
    i+j+k is not equal to N.
    """

    '''Without using list comprehensions'''
    # res = []
    #
    # for i in range(x+1):
    #     for j in range(y+1):
    #         for k in range(z+1):
    #             if (i+j+k) != n:
    #                 res.append([i, j, k])
    # return res

    '''Using list comprehensions'''
    return [[i, j, k] for i in range(x+1) for j in range(y+1) for k in range(z+1) if (i+j+k) != n]


if __name__ == '__main__':
    x_input = int(input())
    y_input = int(input())
    z_input = int(input())
    n_input = int(input())

    print(generate_coordinates(x_input, y_input, z_input, n_input))
