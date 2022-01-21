FROM gitpod/workspace-full-vnc

USER root

RUN apt-get update \
  && apt-get install -y wget \
  && apt-get install -y lp-solve liblpsolve55-dev \
  && cd /opt \
  && wget https://sourceforge.net/projects/lpsolve/files/lpsolve/5.5.2.11/lp_solve_5.5.2.11_java.zip \
  && sleep 8s \
  && unzip lp_solve_5.5.2.11_java.zip && rm lp_solve_5.5.2.11_java.zip \
  && apt-get remove --purge -y wget \
  && apt-get autoremove -y

RUN cd /opt \
  && cp lp_solve_5.5_java/lib/ux64/liblpsolve55j.so /usr/lib/lp_solve/liblpsolve55j.so \
  && chmod 755 /usr/lib/lp_solve/liblpsolve55j.so
  
RUN echo export JAVA_TOOL_OPTIONS=\"\$JAVA_TOOL_OPTIONS -Dsun.java2d.xrender=false\" >> /home/gitpod/.bashrc
  
ENV LD_LIBRARY_PATH /usr/lib/lp_solve

USER 1001
