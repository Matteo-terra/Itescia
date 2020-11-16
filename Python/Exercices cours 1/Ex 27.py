def main():
    
    def motMax(s):
        L = s.split()
        mot = ""
        for x in L:
            if(len(x)>len(mot)):
                mot = x
        return mot
    s = "Python est un langage de programmation orienté objet"
    print("Le mot le plus long dans la chaine s est : ", motMax(s))


if __name__ == '__main__':
    main()
