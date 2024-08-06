from fastapi import FastAPI

app = FastAPI()

@app.get("/api")
def helloWorld():
  return {"message":"Hello world"}
