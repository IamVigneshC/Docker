from flask import Flask
myfirstpython = Flask(__name__)
@myfirstpython.route("/")
def run():
    return "{\"message\":\"My First Python v1\"}"
if __name__ == "__main__":
    myfirstpython.run(host="0.0.0.0", port=int("5000"), debug=True)
