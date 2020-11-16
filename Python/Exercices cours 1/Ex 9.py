def main():
    
    nb = int(input("Veuillez saisir  nombre : "))
    a = 1
    for i in range(1, nb +1) :
        a *= i
    print("La factorielle de {} est {}".format(nb, a))


if __name__ == '__main__':
    main()