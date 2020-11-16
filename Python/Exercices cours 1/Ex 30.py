def main():

    def elementsCommun(l1,l2):
        compteur = 0
        for x in l1:
            if x in l2:
                compteur =+ 1
        if compteur != 0:
            return True
        else:
            return False

    l1 = [2,35,5,6,21]
    l2 = [2,13,5,7,19]
    print(elementsCommun(l1,l2))


if __name__ == '__main__':
    main()
