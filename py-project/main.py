from fastapi import FastAPI # type: ignore

app = FastAPI(root_path='/py')

@app.get("/api")
def helloWorld():
  return {"message":"Hello world"}
