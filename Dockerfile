FROM ubuntu:latest
LABEL authors="callumcampbell"

ENTRYPOINT ["top", "-b"]