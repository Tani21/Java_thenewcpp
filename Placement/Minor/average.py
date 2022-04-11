import pandas as pd
import matplotlib.pyplot as plt
from collections import Counter
dataset = pd.read_excel('nutriCopy.xlsx',sheet_name=0)
#print(dataset)

print(dataset[[ 'serving_size','calories','total_fat','saturated_fat','cholesterol','sodium','choline','irom','folate','folic_acid','niacin','pantothenic_acid','riboflavin','thiamin','vitamin_a','vitamin_a_rae','carotene_alpha','carotene_beta','cryptoxanthin_beta','lutein_zeaxanthin','lucopene','vitamin_b12','vitamin_b6','vitamin_c','vitamin_d','vitamin_e','tocopherol_alpha','vitamin_k','calcium','copper','magnesium','manganese','phosphorous','potassium','selenium','zink','protein','alanine','arginine','aspartic_acid','cystine','glutamic_acid','glycine','histidine','hydroxyproline','isoleucine','leucine','lysine','methionine','phenylalanine','proline','serine','threonine','tryptophan','tyrosine','valine','carbohydrate','fiber','sugars','fructose','galactose','glucose','lactose','maltose','sucrose','fat','saturated_fatty_acids','monounsaturated_fatty_acids','polyunsaturated_fatty_acids','fatty_acids_total_trans','alcohol','ash','caffeine','theobromine','water']].mean())

print("new avearge mode detected")

print(dataset[[ 'serving_size','calories','total_fat','saturated_fat','cholesterol','sodium','choline','irom','folate','folic_acid','niacin','pantothenic_acid','riboflavin','thiamin','vitamin_a','vitamin_a_rae','carotene_alpha','carotene_beta','cryptoxanthin_beta','lutein_zeaxanthin','lucopene','vitamin_b12','vitamin_b6','vitamin_c','vitamin_d','vitamin_e','tocopherol_alpha','vitamin_k','calcium','copper','magnesium','manganese','phosphorous','potassium','selenium','zink','protein','alanine','arginine','aspartic_acid','cystine','glutamic_acid','glycine','histidine','hydroxyproline','isoleucine','leucine','lysine','methionine','phenylalanine','proline','serine','threonine','tryptophan','tyrosine','valine','carbohydrate','fiber','sugars','fructose','galactose','glucose','lactose','maltose','sucrose','fat','saturated_fatty_acids','monounsaturated_fatty_acids','polyunsaturated_fatty_acids','fatty_acids_total_trans','alcohol','ash','caffeine','theobromine','water']].median())

print("new avearge mode detected")

job_time = dataset['serving_size'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['calories'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['total_fat'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['saturated_fat'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['cholesterol'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['sodium'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['choline'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['irom'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['folate'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['folic_acid'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['niacin'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['pantothenic_acid'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['riboflavin'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['thiamin'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['vitamin_a'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['vitamin_a_rae'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['carotene_alpha'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['carotene_beta'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['cryptoxanthin_beta'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['lutein_zeaxanthin'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['lucopene'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['vitamin_b12'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['vitamin_b6'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['vitamin_c'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['vitamin_d'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['vitamin_e'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['tocopherol_alpha'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)


job_time = dataset['vitamin_k'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)


job_time = dataset['calcium'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['copper'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['magnesium'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['manganese'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['phosphorous'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['potassium'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['selenium'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['zink'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['protein'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['alanine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['arginine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['aspartic_acid'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['cystine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['glutamic_acid'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['glycine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['histidine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['hydroxyproline'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['isoleucine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['leucine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['lysine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['methionine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['phenylalanine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['proline'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['serine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['threonine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['tryptophan'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['tyrosine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['valine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['carbohydrate'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['fiber'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['sugars'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['fructose'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['galactose'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['glucose'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['lactose'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['maltose'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['sucrose'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['fat'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['saturated_fatty_acids'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['monounsaturated_fatty_acids'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['polyunsaturated_fatty_acids'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['fatty_acids_total_trans'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['alcohol'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['ash'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['caffeine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['theobromine'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

job_time = dataset['water'].values
data = dict(Counter(job_time))
mode = [k for k, v in data.items() if v == max(list(data.values()))]
print(mode)

print("khush hoja")

print(dataset[['serving_size','calories','total_fat','saturated_fat','cholesterol','sodium','choline','irom','folate','folic_acid','niacin','pantothenic_acid','riboflavin','thiamin','vitamin_a','vitamin_a_rae','carotene_alpha','carotene_beta','cryptoxanthin_beta','lutein_zeaxanthin','lucopene','vitamin_b12','vitamin_b6','vitamin_c','vitamin_d','vitamin_e','tocopherol_alpha','vitamin_k','calcium','copper','magnesium','manganese','phosphorous','potassium','selenium','zink','protein','alanine','arginine','aspartic_acid','cystine','glutamic_acid','glycine','histidine','hydroxyproline','isoleucine','leucine','lysine','methionine','phenylalanine','proline','serine','threonine','tryptophan','tyrosine','valine','carbohydrate','fiber','sugars','fructose','galactose','glucose','lactose','maltose','sucrose','fat','saturated_fatty_acids','monounsaturated_fatty_acids','polyunsaturated_fatty_acids','fatty_acids_total_trans','alcohol','ash','caffeine','theobromine','water']].describe(include='all'))
