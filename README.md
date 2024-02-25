# prj-blue

# 開発用コンテナ構築
```
docker image build -t java-dev-environment:v0.0.1 -f ./Docker/Dockerfile .
```

```
docker container run -itd --name java-dev -v ${PWD}/src:/src java-dev-environment:v0.0.1
```

# Mavenでプロジェクト作成
```
mvn archetype:generate -DgroupId=bowplusplus -DartifactId=health-prj -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```