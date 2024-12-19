import csv
import sys
import numpy as np
import pandas as pd

csv = pd.read_csv('test.csv', sep=',')
nomsColonnes = ["premiere", "derive"]
def plus( premiere ) :
	return 1.0+premiere

def derive (val_premiere) :
    valeur = []
    for val_1 in zip(val_premiere) :
        valeur.append(plus(val_1[0] if isinstance(val_1, tuple) else val_1))
    return valeur

csv[nomsColonnes[2-1]] = derive(csv[nomsColonnes[1-1]])

csv.to_csv('resultat.csv', index=False)


