package com.fanli.metadata.util;

import com.fanli.metadata.entity.base.EtlMetaColumn;
import com.fanli.metadata.entity.base.EtlMetaPartition;
import com.fanli.metadata.entity.base.EtlMetaTableBase;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Administrator on 2015/10/6.
 */
public class CommonUtils {
    private static Logger logger = Logger.getLogger(CommonUtils.class);

    public static String generateExampleSql(EtlMetaTableBase tableBase,EtlMetaPartition metaPartition,List<EtlMetaColumn> partitions) {
        String name = tableBase.getTableName();
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT * FROM " + name.toUpperCase());
        if (metaPartition == null)  {
            sb.append( " LIMIT 10");
            return sb.toString();
        } else {
            String pName = metaPartition.getPartitionName();
            String [] pArray = pName.split("/");
            String firstLevel = pArray[0];
            String k = firstLevel.split("=")[0];
            String v = firstLevel.split("=")[1];
            if (!StringUtils.hasLength(k) || !StringUtils.hasLength(v)) {
                logger.error("partition format is not valid!");
                return null;
            }
            for (EtlMetaColumn p:partitions) {
                if (p.getColumnName().equals(k)) {
                    if (p.getColumnType().toUpperCase().contains("INT")) {
                        sb.append(" WHERE " + k + " = " + v + " LIMIT 10");
                    } else {
                        sb.append(" WHERE " + k + " = " + "\"" + v + "\"" + " LIMIT 10");
                    }
                }
            }

            return sb.toString();
        }
    }
}
