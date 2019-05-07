FROM frekele/ant
RUN echo "It's an image that contains java jdk"

RUN mkdir /data
COPY . /data/
RUN echo "copied all files"

USER root
RUN whoami
RUN ls -la /data/**

CMD [ "sh", "-c", "service ssh start; bash"]