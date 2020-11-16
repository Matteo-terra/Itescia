def main():

    def motsCommuns(s1,s2):
        L1 = s1.split()
        L2 = s2.split()
        communs = []
        for x in L1:
            if(x in L2):
                communs.append(x)
        return communs
        
    s1 = " Python est un langage de programmation de haut niveau"
    s2 = " Python est un langage interprété"
    print("La liste des mots communs à s1 et s2 est : ",motsCommuns(s1,s2))


if __name__ == '__main__':
    main()
