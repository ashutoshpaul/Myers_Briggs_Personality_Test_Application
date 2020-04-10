from flask import Flask, request, Response
from flask_restful import Resource, Api
from flask_restful.representations import json

from Description import descriptionDictionary
from PredictPersonality import getPrediction

app = Flask(__name__)
api = Api(app)

class SendDescription(Resource):
    def get(self , personalityType):
        a = descriptionDictionary[personalityType]
        return json.dumps(a)

class DoPrediction(Resource):
    def get(self , category0, category1 , category2 , category3):
        return getPrediction(category0 , category1 , category2 , category3)

api.add_resource(SendDescription, '/description/<string:personalityType>')
api.add_resource(DoPrediction , '/prediction/<int:category0>/<int:category1>/<int:category2>/<int:category3>')

if __name__ == '__main__':
    app.run(debug=True)
