def main():

    phrase = "Python ephraset un merveilleux langage de programmation"
    premierMot = ""
    i = 0
    while (phrase[i] != " "):
        premierMot = premierMot + phrase[i]
        i = i + 1
    print("Le premier mot de la  phrase est : ", phrase[:i])


if __name__ == '__main__':
    main()
