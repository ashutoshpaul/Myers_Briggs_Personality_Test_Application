import pandas as pd
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split
from sklearn import metrics

def getPrediction(category0 , category1 , category2 , category3):
    col_names = ['category1', 'category2', 'category3', 'category4', 'result']
    personality_data = pd.read_csv('dataset.csv', names=col_names)

    input_columns = ['category1', 'category2', 'category3', 'category4']
    X = personality_data[input_columns]
    y = personality_data['result']

    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.1)

    clasifier = DecisionTreeClassifier()
    clasifier = clasifier.fit(X_train, y_train)

    y_pred = clasifier.predict([[category0, category1 , category2, category3]])
    print(y_pred)
    return str(y_pred)

#prediction(10,20,30,40)