"""
Kevin and Stuart want to play the 'The Minion Game'.

· Game Rules

Both players are given the same string, S.
Both players have to make substrings using the letters of the string S.
Stuart has to make words starting with consonants.
Kevin has to make words starting with vowels.
The game ends when both players have made all possible substrings.

· Scoring

A player gets +1 point for each occurrence of the substring in the string S.
"""


def minion_game(string):
    vowels = 'AEIOU'
    stuart = 0  # Starts with consonant
    kevin = 0  # Starts with vowel

    # If we iterate twice we get a timeout
    # for i in range(len(string)):
    #     for j in range(len(string)-i):
    #         substring = string[i:j+i+1]
    #         if substring[0] in vowels:
    #             kevin += 1
    #         else:
    #             stuart += 1

    # It isn't necessary to iterate twice. We don't need to write any combination. So, if we think about it, we can
    # solve it mathematically.
    # Total combinations of word BANANA = 21
    #     · 6 for each character
    #     · 5 for each two characters
    #     · 4 for each three characters
    #     · 3 for each four characters
    #     · 2 for each five characters
    #     · 1 for each six characters
    # Which of this combinations starts with vowel or not? We have to see each letter of the word. And that's it.

    for i in range(len(string)):
        if string[i] in vowels:
            kevin += len(string) - i
        else:
            stuart += len(string) - i

    if stuart > kevin:
        print("Stuart {0}".format(stuart))
    elif stuart < kevin:
        print("Kevin {0}".format(kevin))
    else:
        print("Draw")


if __name__ == '__main__':
    s = input()
    minion_game(s)
