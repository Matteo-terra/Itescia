def main():
    
    nb1 = int(input("Veuillez saisir un premier nombre : "))
    nb2 = int(input("Veuillez saisir un second nombre : "))
    nb3 = int(input("Veuillez saisir un troisième nombre : "))
    Max = max(nb1,nb2,nb3)
    print("Le maximum de vos 3 nombres est :" + str(Max))
    

if __name__ == '__main__':
    main()