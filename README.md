# prj-blue

# 開発用コンテナ構築
```
docker image build -t java-dev-environment:v0.0.1 -f ./Docker/Dockerfile .
```

```
docker container run -itd --name java-dev -v ${PWD}/src:/src java-dev-environment:v0.0.1
```
