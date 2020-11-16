def main():
    
    s = "Exemple     de texte avec des    espaces     multiple"
    L = s.split()
    texteSansEspace = ""

    for x in L:
        texteSansEspace = texteSansEspace + x + " "
    print(texteSansEspace)


if __name__ == '__main__':
    main()
