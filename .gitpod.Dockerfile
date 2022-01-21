FROM gitpod/workspace-full-vnc

RUN apt-get update \
  && cd /opt \
  && wget https://sourceforge.net/projects/lpsolve/files/lpsolve/5.5.2.11/lp_solve_5.5.2.11_java.zip \
  && sleep 8s \
  && unzip lp_solve_5.5.2.11_java.zip && rm lp_solve_5.5.2.11_java.zip \
  && apt-get remove --purge -y wget \
  && apt-get autoremove -y \
  && rm -rf /var/lib/apt/lists/*

RUN cd /opt \
  && cp lp_solve_5.5_java/lib/ux64/liblpsolve55j.so /usr/lib \
  && chmod 755 /usr/lib/liblpsolve55j.so
