package com.jeffry.enhancement.document.archiving.client.shell.core;

import com.jeffry.enhancement.document.archiving.worker.core.DocumentArchivingWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @author ddwrj
 */
@Slf4j
@ShellComponent
public class ArchiveCommand {

    @Autowired
    private DocumentArchivingWorker documentArchivingWorker;

    @ShellMethod("根据配置文件扫描目录")
    public void scan(){
        log.info("准备根据配置文件扫描目录");
        documentArchivingWorker.scanPath(null);
    }
}
